package Program_15 

package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[(Int,Byte)]
case class CC_B[D](a: T_B[D, D], b: CC_A) extends T_A[(Int,Byte)]
case class CC_C[E](a: E, b: T_A[E], c: T_A[E]) extends T_A[E]

val v_a: T_A[(Int,Byte)] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A()) => 1 
  case CC_B(_, _) => 2 
  case CC_C((_,0), CC_A(), _) => 3 
  case CC_C((12,_), CC_B(_, _), _) => 4 
  case CC_C(_, _, CC_C(_, _, _)) => 5 
  case CC_C((_,_), _, CC_C(_, _, _)) => 6 
  case CC_C((12,0), CC_A(), CC_B(_, _)) => 7 
  case CC_C((12,0), _, CC_A()) => 8 
  case CC_C(_, _, _) => 9 
  case CC_C((12,0), CC_B(_, _), CC_A()) => 10 
  case CC_C((_,_), CC_A(), CC_C(_, _, _)) => 11 
  case CC_C((12,0), CC_A(), _) => 12 
  case CC_C((12,0), _, CC_B(_, _)) => 13 
  case CC_C((_,_), CC_B(_, _), CC_B(_, _)) => 14 
  case CC_C((12,0), CC_C(_, _, _), _) => 15 
  case CC_C((_,0), _, CC_B(_, _)) => 16 
  case CC_C(_, _, CC_A()) => 17 
  case CC_C((_,_), CC_A(), _) => 18 
  case CC_C((12,0), CC_A(), CC_A()) => 19 
  case CC_C((12,_), CC_C(_, _, _), CC_B(_, _)) => 20 
  case CC_C((12,_), CC_A(), CC_C(_, _, _)) => 21 
  case CC_C((12,_), CC_A(), CC_B(_, _)) => 22 
  case CC_C((_,0), CC_A(), CC_A()) => 23 
  case CC_C((12,0), CC_C(_, _, _), CC_C(_, _, _)) => 24 
  case CC_C(_, CC_B(_, _), CC_B(_, _)) => 25 
  case CC_C((_,_), CC_C(_, _, _), CC_A()) => 26 
  case CC_C((12,_), _, _) => 27 
  case CC_C((_,_), CC_A(), CC_B(_, _)) => 28 
  case CC_C((_,_), CC_C(_, _, _), CC_C(_, _, _)) => 29 
  case CC_C((12,_), _, CC_C(_, _, _)) => 30 
  case CC_C((_,0), _, _) => 31 
  case CC_C((_,0), CC_C(_, _, _), CC_A()) => 32 
  case CC_C((_,_), CC_B(_, _), CC_A()) => 33 
  case CC_C((_,0), CC_B(_, _), CC_C(_, _, _)) => 34 
  case CC_C((12,_), CC_A(), _) => 35 
  case CC_C((12,_), CC_B(_, _), CC_C(_, _, _)) => 36 
  case CC_C((12,0), CC_B(_, _), CC_B(_, _)) => 37 
  case CC_C((12,0), _, _) => 38 
  case CC_C((12,_), _, CC_A()) => 39 
  case CC_C((_,_), CC_A(), CC_A()) => 40 
  case CC_C(_, CC_C(_, _, _), CC_A()) => 41 
  case CC_C(_, CC_B(_, _), CC_A()) => 42 
  case CC_C((12,0), CC_A(), CC_C(_, _, _)) => 43 
  case CC_C((_,0), CC_C(_, _, _), CC_C(_, _, _)) => 44 
  case CC_C(_, CC_A(), CC_B(_, _)) => 45 
  case CC_C(_, CC_B(_, _), CC_C(_, _, _)) => 46 
  case CC_C((12,_), CC_A(), CC_A()) => 47 
  case CC_C(_, CC_C(_, _, _), CC_B(_, _)) => 48 
  case CC_C((12,0), CC_C(_, _, _), CC_A()) => 49 
  case CC_C(_, CC_C(_, _, _), _) => 50 
  case CC_C((_,_), CC_C(_, _, _), CC_B(_, _)) => 51 
  case CC_C((12,0), CC_B(_, _), _) => 52 
  case CC_C((_,0), CC_C(_, _, _), CC_B(_, _)) => 53 
  case CC_C((_,0), CC_C(_, _, _), _) => 54 
}
}
// This is not matched: (CC_B Boolean Wildcard (CC_A (T_A (Tuple Int Byte))) (T_A (Tuple Int Byte)))
// This is not matched: (CC_A (T_A (Tuple Int Byte)))