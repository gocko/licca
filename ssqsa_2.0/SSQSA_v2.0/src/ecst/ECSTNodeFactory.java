/*
 * Copyright (C) 2012-2013 by Milos Savic 
 *
 * Permission to use, copy, modify, and distribute this software and its
 * documentation under the terms of the GNU General Public License is hereby 
 * granted. See the GNU General Public License for more details.
 */

package ecst;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


public class ECSTNodeFactory {

	// TODO: loading from conf file
	private static final String[][] mapper = {
		{"ARGUMENT",            "ecst.universalNodes.Argument"},
		{"ARGUMENT_LIST",       "ecst.universalNodes.ArgumentList"},
		{"ATTRIBUTE_DECL",      "ecst.universalNodes.AttributeDecl"},
		{"BLOCK_SCOPE",         "ecst.universalNodes.BlockScope"},
		{"CONCRETE_UNIT_DECL",  "ecst.universalNodes.ConcreteUnitDecl"},
		{"EXTENDS",             "ecst.universalNodes.Extends"},
		{"FORMAL_PARAM_LIST",   "ecst.universalNodes.FormalParamList"},
		{"FUNCTION_CALL",       "ecst.universalNodes.FunctionCall"},
		{"FUNCTION_DECL",       "ecst.universalNodes.FunctionDecl"},
		{"IMPLEMENTS",          "ecst.universalNodes.Implements"},
		{"INSTANTIATES",        "ecst.universalNodes.Instantiates"},
		{"IMPORT_DECL",         "ecst.universalNodes.ImportDecl"},
		{"INTERFACE_UNIT_DECL", "ecst.universalNodes.InterfaceUnitDecl"},
		{"NAME",                "ecst.universalNodes.Name"},
		{"NAME_IGNORE",         "ecst.universalNodes.NameIgnore"},
		{"PACKAGE_DECL",        "ecst.universalNodes.PackageDecl"},
		{"PARAMETER_DECL",      "ecst.universalNodes.ParameterDecl"},
		{"TYPE",                "ecst.universalNodes.Type"},
		{"TYPE_DECL",           "ecst.universalNodes.TypeDecl"},
		{"VAR_DECL",            "ecst.universalNodes.VarDecl"}
		//{"IGNORE",              "ecst.universalNodes.Ignore"},
		//OWLMetrics nodes
		
		//{"AXIOM",               "ecst.universalNodes..Axiom"},
		//{"CONST",               "ecst.universalNodes.Const"},
		//{"DST",                 "ecst.universalNodes.Dst"},
		//{"EXPR",                "ecst.universalNodes.Expr"},
		//{"KEYWORD",             "ecst.universalNodes.Keyword"},
		//{"OPERATOR",            "ecst.universalNodes.Operator"},
		//{"NAME",                "ecst.universalNodes.Name"},
		//{"PARTIAL_BINARY_RELATION", "ecst.universalNodes.PartialBinaryRelation"},
		//{"BINARY_RELATION",     "ecst.universalNodes.BinaryRelation"},
		//{"SRELATION",       	"ecst.universalNodes.SRelation"},
		//{"SEPARATOR",           "ecst.universalNodes.Separator"}
		//{"SRC",                 "ecst.universalNodes.Src"}
		

	};
	
	private static final String[] restOfUniversalNodes = {
		"THROWS","CONST", "CONSTRUCTOR_CALL", "CONSTRUCTOR_DECL",
		"BRANCH", "BRANCH_STATEMENT", "CONDITION",
		"LOOP_STATEMENT", "LOGICAL_OPERATOR", "JUMP_STATEMENT",
		"FOR_EACH", "LABELED_STATEMENT", "CATCH_CLAUSE_LIST",
		"SWITCH_BLOCK_LABEL_LIST", "IGNORE", "VOID",
		"H_TYPE", "H_CONSTANT", "KEYWORD", "OPERATOR", "H_SEPARATOR",
		"H_DIRECTIVE", "MODIFIER_LIST", "VALUE", "COMPARISON_OPERATOR",
		"ASSIGN_OPERATOR", "SEPARATOR", "ASSIGNMENT_STATEMENT", "KEYWORD", 
		"INIT", "STEP"
	};
	
	public static boolean universalNode(ShortToken shortToken) {
		if ((shortToken.getLine().compareTo("0") == 0) && (shortToken.getColumn().compareTo("-1") == 0) ){
			for (int i = 0; i < mapper.length; i++) {
			//proveravamo vrstu i kolonu
				if (mapper[i][0].compareTo(shortToken.getText()) == 0)  {
					return true;
				}
			}
		
			for (int i = 0; i < restOfUniversalNodes.length; i++) {
				if (restOfUniversalNodes[i].compareTo(shortToken.getText()) == 0)  {
					return true;
				}
			}
		}
		
		return false;
	}
		
	
	private static String findClass(ShortToken token) {
		if ((token.getLine().compareTo("0") == 0) && (token.getColumn().compareTo("-1") == 0) ){

		for (int i = 0; i < mapper.length; i++) {
			if (mapper[i][0].compareTo(token.getText()) == 0) {
				return mapper[i][1];
			}
		}
		}
		
		return null;
	}
	
	public static ECSTNode create(ShortToken token, ECSTNode parent) {
		try {
			//System.out.println(token.getText());
			String className = findClass(token);
			if (className == null)
				return new ECSTNode(token, parent);
			
			Class<?> c = Class.forName(className);
			Constructor<?>[] cons = c.getConstructors();
			ECSTNode eNode = (ECSTNode) cons[0].newInstance(token, parent);
			return eNode;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			System.out.println(token + " " + parent.getToken().toString());
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
