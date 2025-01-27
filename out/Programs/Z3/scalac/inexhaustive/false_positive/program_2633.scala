package Program_31 

package Program_3 

object Test {
sealed trait T_A[A]
case class CC_A(a: (Boolean,Boolean), b: T_A[Byte]) extends T_A[(Boolean,Int)]
case class CC_B[B](a: CC_A, b: CC_A, c: (Boolean,CC_A)) extends T_A[(Boolean,Int)]
case class CC_C[C](a: T_A[C], b: CC_B[C]) extends T_A[C]

val v_a: T_A[(Boolean,Int)] = null
val v_b: Int = v_a match{
  case CC_A((_,_), CC_C(_, _)) => 0 
  case CC_C(CC_A(_, _), CC_B(_, _, _)) => 1 
  case CC_C(CC_B(_, _, _), _) => 2 
  case CC_C(CC_C(_, _), CC_B(_, _, _)) => 3 
  case CC_C(_, _) => 4 
  case CC_C(_, CC_B(_, _, _)) => 5 
  case CC_C(CC_A(_, _), _) => 6 
  case CC_B(CC_A(_, _), _, (_,CC_A(_, _))) => 7 
  case CC_B(CC_A(_, _), _, _) => 8 
  case CC_B(_, _, _) => 9 
  case CC_B(_, CC_A(_, _), (_,CC_A(_, _))) => 10 
}
}
// This is not matched: (CC_B Boolean Wildcard Wildcard Wildcard (T_A (Tuple Boolean Int)))
// This is not matched: (CC_B Wildcard T_A)