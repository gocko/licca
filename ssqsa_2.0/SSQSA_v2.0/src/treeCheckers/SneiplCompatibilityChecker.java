package treeCheckers;

import java.io.PrintWriter;
import org.antlr.runtime.tree.Tree;

public class SneiplCompatibilityChecker extends CompatibilityChecker {
	
	private boolean importCheck(Tree subtree, String source, PrintWriter pw) {
		boolean ok = true;
		
		int childCnt = subtree.getChildCount();
		if (childCnt == 0) {
			pw.println("IMPORT, empty subtree, " + source + ", " + reversedPath(subtree));
			return false;
		} 
		
		String fp = dfsWoRoot(subtree);
		
		if (childCnt > 2) {
			pw.println("IMPORT, first level more than two nodes, " + source + ", " + fp);
			ok = false;
		}
		
		int nameCnt = countChild("NAME", subtree);
		if (nameCnt == 0) {
			pw.println("IMPORT, no NAME in first level, " + source + ", " + fp);
			ok = false;
		} 
		else
		if (nameCnt != 1) {
			pw.println("IMPORT, NAME at first level is not unique, " + source + ", " + fp);
			ok = false;
		}
		
		return ok;
	}
	
	private boolean packageCheck(Tree subtree, String source, PrintWriter pw) {
		boolean ok = true;
		
		int childCnt = subtree.getChildCount();
		if (childCnt == 0) {
			pw.println("PACKAGE_DECL, empty subtree, " + source + ", " + reversedPath(subtree));
			return false;
		} 
		
		int nameCnt = countChild("NAME", subtree);
		if (nameCnt > 1) {
			pw.println("PACKAGE_DECL, NAME at first level is not unique, " + source);
			ok = false;
		}
		
		/*
		int cudCnt = countChild("CONCRETE_UNIT_DECL", subtree);
		int iudCnt = countChild("INTERFACE_UNIT_DECL", subtree);
		int tdCnt = countChild("TYPE_DECL", subtree);
		int fd = countChild("FUNCTION_DECL", subtree);
		int ad = countChild("ATTRIBUTE_DECL", subtree);
		
		if (cudCnt == 0 && iudCnt == 0 && tdCnt == 0 && fd == 0 && ad == 0) {
			pw.println("EMPTY PACKAGE_DECL ?!, " + source);
			ok = false;
		}
		*/
		return ok;
	}
	
	private boolean concreteUnitDeclCheck(Tree subtree, String source, PrintWriter pw) {
		boolean ok = true;
		
		int childCnt = subtree.getChildCount();
		if (childCnt == 0) {
			pw.println("CONCRETE_UNIT_DECL, empty subtree, " + source + ", " + reversedPath(subtree));
			return false;
		} 
		
		String fp = dfsWoRoot(subtree);
		
		int nameCnt = countChild("NAME", subtree);
		if (nameCnt == 0) {
			pw.println("CONCRETE_UNIT_DECL, no NAME in first level, " + source + ", " + fp);
			ok = false;
		} 
		else
		if (nameCnt != 1) {
			pw.println("CONCRETE_UNIT_DECL, NAME at first level is not unique, " + source + ", " + fp);
			ok = false;
		}
		
		return ok;
	}
	
	private boolean extendsCheck(Tree subtree, String source, PrintWriter pw) {
		boolean ok = true;
		
		int childCnt = subtree.getChildCount();
		if (childCnt == 0) {
			pw.println("EXTENDS, empty subtree, " + source + ", " + reversedPath(subtree));
			return false;
		}
		
		String fp = dfsWoRoot(subtree);
		
		int nameCnt = countChild("TYPE", subtree);
		if (nameCnt == 0) {
			pw.println("EXTENDS, no TYPE in first level, " + source + ", " + fp);
			ok = false;
		} 
		else
		if (nameCnt != 1) {
			pw.println("EXTENDS, TYPE at first level is not unique, " + source + ", " + fp);
			ok = false;
		}
		
		//if (childCnt != 1) {
		//	pw.println("EXTENDS, first level has more than one node " + source + ", " + fp);
		//	ok = false;
		//}
		
		return ok;
	}
	
	private boolean implementsCheck(Tree subtree, String source, PrintWriter pw) {
		boolean ok = true;
		
		int childCnt = subtree.getChildCount();
		if (childCnt == 0) {
			pw.println("IMPLEMENTS, empty subtree, " + source + ", " + reversedPath(subtree));
			return false;
		}
		
		String fp = dfsWoRoot(subtree);
		
		int nameCnt = countChild("TYPE", subtree);
		if (nameCnt == 0) {
			pw.println("IMPLEMENTS, no TYPE in first level, " + source + ", " + fp);
			ok = false;
		} 
		else
		if (nameCnt != 1) {
			pw.println("IMPLEMENTS, TYPE at first level is not unique, " + source + ", " + fp);
			ok = false;
		}
		
		if (childCnt != 1) {
			pw.println("IMPLEMENTS, first level has more than one node " + source + ", " + fp);
			ok = false;
		}
		
		return ok;
	}
	
	private boolean attributeDeclCheck(Tree subtree, String source, PrintWriter pw) {
		boolean ok = true;
		
		int childCnt = subtree.getChildCount();
		if (childCnt == 0) {
			pw.println("ATTRIBUTE_DECL, empty subtree, " + source + ", " + reversedPath(subtree));
			return false;
		}
		
		String fp = dfsWoRoot(subtree);
	
		int typeCnt = countChild("TYPE", subtree);
		if (typeCnt == 0) {
			pw.println("ATTRIBUTE_DECL, no TYPE in first level, " + source + ", " + fp);
			ok = false;
		} 
		else
		if (typeCnt != 1) {
			pw.println("ATTRIBUTE_DECL, TYPE at first level is not unique, " + source + ", " + fp);
			ok = false;
		}
		
		int nameCnt = countChild("NAME", subtree);
		if (nameCnt == 0) {
			pw.println("ATTRIBUTE_DECL, no NAME in first level, " + source + ", " + fp);
			ok = false;
		} 
		else
		if (nameCnt != 1) {
			pw.println("ATTRIBUTE_DECL, NAME at first level is not unique, " + source + ", " + fp);
			ok = false;
		}
		
		return ok;
	}
	
	private boolean varDeclCheck(Tree subtree, String source, PrintWriter pw) {
		boolean ok = true;
		
		int childCnt = subtree.getChildCount();
		if (childCnt == 0) {
			pw.println("VAR_DECL, empty subtree, " + source + ", " + reversedPath(subtree));
			return false;
		}
		
		String fp = dfsWoRoot(subtree);
	
		int typeCnt = countChild("TYPE", subtree);
		if (typeCnt == 0) {
			pw.println("VAR_DECL, no TYPE in first level, " + source + ", " + fp);
			ok = false;
		} 
		else
		if (typeCnt != 1) {
			pw.println("VAR_DECL, TYPE at first level is not unique, " + source + ", " + fp);
			ok = false;
		}
		
		int nameCnt = countChild("NAME", subtree);
		if (nameCnt == 0) {
			pw.println("VAR_DECL, no NAME in first level, " + source + ", " + fp);
			ok = false;
		} 
		else
		if (nameCnt != 1) {
			pw.println("VAR_DECL, NAME at first level is not unique, " + source + ", " + fp);
			ok = false;
		}
		
		return ok;
	}
	
	private boolean functionDeclCheck(Tree subtree, String source, PrintWriter pw) {
		boolean ok = true;
		
		int childCnt = subtree.getChildCount();
		if (childCnt == 0) {
			pw.println("FUNCTION_DECL, empty subtree, " + source + ", " + reversedPath(subtree));
			return false;
		}
		
		String fp = dfsWoRoot(subtree);
		
		int nameCnt = countChild("NAME", subtree);
		if (nameCnt == 0) {
			pw.println("FUNCTION_DECL, no NAME in first level, " + source + ", " + fp);
			ok = false;
		} 
		else
		if (nameCnt != 1) {
			pw.println("FUNCTION_DECL, NAME at first level is not unique, " + source + ", " + fp);
			ok = false;
		}
		
		/*  AKO NEMA FORMAL_PARAM_LIST nema ni parametara
		int fplCnt = countChild("FORMAL_PARAM_LIST", subtree);
		if (fplCnt == 0) {
			pw.println("FUNCTION_DECL, no FORMAL_PARAM_LIST in first level, " + source + ", " + fp);
			ok = false;
		} 
		else
		if (fplCnt != 1) {
			pw.println("FUNCTION_DECL, FORMAL_PARAM_LIST at first level is not unique, " + source + ", " + fp);
			ok = false;
		}
		*/
		
		/* moze imati vise TYPE zbog exceptions-a, uzimamo prvi sa leva
		 * za return type, MORA POSTOJATI AT LEAST ONE TYPE
		 */
		//int typeCnt = countChild("TYPE", subtree);
		//if (typeCnt == 0) {
		//	pw.println("FUNCTION_DECL, no TYPE in first level, " + source + ", " + fp);
		//	ok = false;
		//}
		
		return ok;
	}
	
	private boolean fplCheck(Tree subtree, String source, PrintWriter pw) {
		/*
		int childCnt = subtree.getChildCount();
		if (childCnt > 0) {
			String fp = dfsWoRoot(subtree);
			for (int i = 0; i < childCnt; i++) {
				if (subtree.getChild(i).getText().compareTo("PARAMETER_DECL") != 0) {
					pw.println("FORMAL_PARAM_LIST, contains child different than PARAMETER_DECL: " + 
				               subtree.getChild(i).getText() + ", " + source + ", " + fp);
							  
					return false;
				}
			}
		}*/
		
		return true;
	}
	
	private boolean parameterDeclCheck(Tree subtree, String source, PrintWriter pw) {
		boolean ok = true;
		
		int childCnt = subtree.getChildCount();
		if (childCnt == 0) {
			pw.println("PARAMETER_DECL, empty subtree, " + source + ", " + reversedPath(subtree));
			return false;
		}
		
		String fp = dfsWoRoot(subtree);
	
		int typeCnt = countChild("TYPE", subtree);
		if (typeCnt == 0) {
			pw.println("PARAMETER_DECL, no TYPE in first level, " + source + ", " + fp);
			ok = false;
		} 
		else
		if (typeCnt != 1) {
			pw.println("PARAMETER_DECL, TYPE at first level is not unique, " + source + ", " + fp);
			ok = false;
		}
		
		int nameCnt = countChild("NAME", subtree);
		if (nameCnt == 0) {
			pw.println("PARAMETER_DECL, no NAME in first level, " + source + ", " + fp);
			ok = false;
		} 
		else
		if (nameCnt != 1) {
			pw.println("PARAMETER_DECL, NAME at first level is not unique, " + source + ", " + fp);
			ok = false;
		}
		
		return ok;
	}
	
	private boolean functionCallCheck(Tree subtree, String source, PrintWriter pw) {
		boolean ok = true;
		
		int childCnt = subtree.getChildCount();
		if (childCnt == 0) {
			pw.println("FUNCTION_CALL, empty subtree, " + source + ", " + reversedPath(subtree));
			return false;
		}
		
		String fp = dfsWoRoot(subtree);
		
		//if (childCnt != 2) {
		//	pw.println("FUNCTION_CALL, size(first level) != 2, " + source + ", " + fp);
		//}
		
		int nameCnt = countChild("NAME", subtree);
		if (nameCnt == 0) {
			pw.println("FUNCTION_CALL, no NAME in first level, " + source + ", " + fp);
			ok = false;
		} 
		else
		if (nameCnt != 1) {
			pw.println("FUNCTION_CALL, NAME at first level is not unique, " + source + ", " + fp);
			ok = false;
		}
		
		int argListCnt = countChild("ARGUMENT_LIST", subtree);
		//if (argListCnt == 0) {
		//	pw.println("FUNCTION_CALL, no ARGUMENT_LIST in first level, " + source + ", " + fp);
		//	ok = false;
		//} 
		//else
		if (argListCnt > 1) {
			pw.println("FUNCTION_CALL, ARGUMENT_LIST at first level is not unique, " + source + ", " + fp);
			ok = false;
		}
		
		return ok;
	}
	
	private boolean argumentListCheck(Tree subtree, String source, PrintWriter pw) {
		/* Modula-2 compatibility: ( ) can appear
		int childCnt = subtree.getChildCount();
		if (childCnt > 0) {
			String fp = dfsWoRoot(subtree);
			for (int i = 0; i < childCnt; i++) {
				if (subtree.getChild(i).getText().compareTo("ARGUMENT") != 0) {
					pw.println("ARGUMENT_LIST, contains child different than ARGUMENT: " + 
				               subtree.getChild(i).getText() + ", " + source + ", " + fp);
							  
					return false;
				}
			}
		}
		*/
		
		return true;
	}
	
	private boolean argumentCheck(Tree subtree, String source, PrintWriter pw) {
		boolean ok = true;
		
		int childCnt = subtree.getChildCount();
		if (childCnt == 0) {
			pw.println("ARGUMENT, empty subtree, " + source + ", " + reversedPath(subtree));
			return false;
		}
		
		String fp = dfsWoRoot(subtree);
	
		/* numChilds can be different from one
		 * for example:
		 *   const -1
		 *   
		 
		if (childCnt != 1) {
			pw.println("ARGUMENT, numChilds != 1, " + source + ", " + fp);
			ok = false;
		}
		*/
		
		int nameCnt = countChild("NAME", subtree);
		/* argument can be const, complex expr, not just variable 
		if (nameCnt == 0) {
			pw.println("ARGUMENT, no NAME in first level, " + source + ", " + fp);
			ok = false;
		} 
		else
		*/
		if (nameCnt > 1) {
			pw.println("ARGUMENT, NAME at first level is not unique, " + source + ", " + fp);
			ok = false;
		} 
		
		return ok;
	}
	
	
	private boolean instantiatesCheck(Tree subtree, String source, PrintWriter pw) {
		boolean ok = true;
		
		int childCnt = subtree.getChildCount();
		if (childCnt == 0) {
			pw.println("INSTANTIATES, empty subtree, " + source + ", " + reversedPath(subtree));
			return false;
		}
		
		String fp = dfsWoRoot(subtree);
		
		int typeCnt = countChild("TYPE", subtree);
		if (typeCnt > 1) {
			pw.println("INSTANTIATES, TYPE at first level is not unique, " + source + ", " + fp);
			ok = false;
		}
	
		int argListCnt = countChild("ARGUMENT_LIST", subtree);
		if (argListCnt > 1) {
			pw.println("INSTANTIATES, ARGUMENT_LIST at first level is not unique, " + source + ", " + fp);
			ok = false;
		}
		
		if (typeCnt == 0 && argListCnt > 0) {
			pw.println("INSTANTIATES, ARGUMENT_LIST wo TYPE" + source + ", " + fp);
			ok = false;
		}
		
		// ne mora, zbog nizova
		//if (argListCnt == 0 && typeCnt == 0) {
		//	pw.println("INSTANTIATES, TYPE wo ARGUMENT_LIST" + source + ", " + fp);
		//	ok = false;
		//}
		
		return ok;
	}
	
	private boolean nameCheck(Tree subtree, String source, PrintWriter pw) {
		int childCnt = subtree.getChildCount();
		if (childCnt == 0) {
			pw.println("NAME, empty subtree, " + source + ", " + reversedPath(subtree));
			return false;
		}
		
		/*
		int d = depth(subtree);
		if (d > 1) {
			String fp = dfsWoRoot(subtree);
			nameLog.println(d + "|" + childCnt + "|" + source + "|" + fp);
		}
		*/
		
		return true;
	}
	
	private int depth(Tree subtree) {
		if (subtree == null)
			return 0;
		else
		if (subtree.getChildCount() == 0)
			return 1;
		else {
			int maxDepth = depth(subtree.getChild(0));
			for (int i = 1; i < subtree.getChildCount(); i++) {
				int tDepth = depth(subtree.getChild(i));
				if (tDepth > maxDepth)
					tDepth = maxDepth;
			}
			
			return maxDepth;
		}
	}
	
	private boolean typeCheck(Tree subtree, String source, PrintWriter pw) {
		boolean ok = true;
		
		int childCnt = subtree.getChildCount();
		if (childCnt == 0) {
			pw.println("TYPE, empty subtree, " + source + ", " + reversedPath(subtree));
			return false;
		}
		
		String fp = dfsWoRoot(subtree);
		
		int d = depth(subtree);
		
		
		int nameCnt = countChild("NAME", subtree);
		if (nameCnt == 0) {
			//pw.println("TYPE, no NAME in first level, " + source + ", " + fp);
			//ok = false;
			// Ako type nema NAME onda se radi o primitivnom tipu podataka (Java)
			if (childCnt > 1 && d > 1) {
				pw.println("TYPE, complex TYPE subtree wo NAME node, " + source + ", " + fp);
				ok = false;
			}
		} 
		else
		if (nameCnt != 1) {
			pw.println("TYPE, NAME at first level is not unique, " + source + ", " + fp);
			ok = false;
		}
		
		return ok;
	}
	
	private boolean checkTypeDecl(Tree subtree, String source, PrintWriter pw) {
		boolean ok = true;
		
		int childCnt = subtree.getChildCount();
		if (childCnt == 0) {
			pw.println("TYPE_DECL, empty subtree, " + source + ", " + reversedPath(subtree));
			return false;
		} 
		
		String fp = dfsWoRoot(subtree);
		
		int nameCnt = countChild("NAME", subtree);
		if (nameCnt == 0) {
			pw.println("TYPE_DECL, no NAME in first level, " + source + ", " + fp);
			ok = false;
		} 
		else
		if (nameCnt != 1) {
			pw.println("TYPE_DECL, NAME at first level is not unique, " + source + ", " + fp);
			ok = false;
		}
		
		return ok;
	}
	
	public boolean evaluateNode(String token, Tree subtree, String source, PrintWriter pw) 
	{
		if (token.compareTo("IMPORT_DECL") == 0) {
			return importCheck(subtree, source, pw);
		}
		else
		if (token.compareTo("PACKAGE_DECL") == 0) {
			return packageCheck(subtree, source, pw);
		}
		else
		if (token.compareTo("CONCRETE_UNIT_DECL") == 0) {
			return concreteUnitDeclCheck(subtree, source, pw);
		}
		else
		if (token.compareTo("EXTENDS") == 0) {
			return extendsCheck(subtree, source, pw);
		}
		else
		if (token.compareTo("IMPLEMENTS") == 0) {
			return implementsCheck(subtree, source, pw);
		}
		else
		if (token.compareTo("ATTRIBUTE_DECL") == 0) {
			return attributeDeclCheck(subtree, source, pw);
		}
		else
		if (token.compareTo("VAR_DECL") == 0) {
			return varDeclCheck(subtree, source, pw);
		}
		else
		if (token.compareTo("FUNCTION_DECL") == 0) {
			return functionDeclCheck(subtree, source, pw);
		}
		else
		if (token.compareTo("FORMAL_PARAM_LIST") == 0) {
			return fplCheck(subtree, source, pw);
		}
		else
		if (token.compareTo("PARAMETER_DECL") == 0) {
			return parameterDeclCheck(subtree, source, pw);
		}
		else
		if (token.compareTo("FUNCTION_CALL") == 0) {
			return functionCallCheck(subtree, source, pw);
		}
		else 
		if (token.compareTo("ARGUMENT_LIST") == 0) {
			return argumentListCheck(subtree, source, pw);
		}
		else
		if (token.compareTo("ARGUMENT") == 0) {
			return argumentCheck(subtree, source, pw);
		}
		else
		if (token.compareTo("INSTANTIATES") == 0) {
			return instantiatesCheck(subtree, source, pw);
		}
		else
		if (token.compareTo("TYPE") == 0) {
			return typeCheck(subtree, source, pw);
		}
		else
		if (token.compareTo("NAME") == 0) {
			return nameCheck(subtree, source, pw);
		}
		else
		if (token.compareTo("TYPE_DECL") == 0) {
			return checkTypeDecl(subtree, source, pw);
		}
		
		return true;
	}
}
