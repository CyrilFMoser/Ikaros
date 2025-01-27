package Program_13 

package Program_1 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: T_A, c: (T_A,T_A)) extends T_A
case class CC_B[B](a: T_A, b: CC_A, c: CC_A) extends T_B[B]
case class CC_C[C, D](a: D, b: T_B[C], c: T_A) extends T_B[C]
case class CC_D[E](a: T_B[E], b: T_B[(Byte,Char)], c: T_A) extends T_B[E]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _), _, _) => 0 
  case CC_B(_, _, CC_A(_, _, _)) => 1 
  case CC_C(_, CC_D(_, _, _), CC_A(_, _, _)) => 2 
  case CC_C(_, CC_B(_, _, _), _) => 3 
  case CC_C(_, CC_C(_, _, _), CC_A(_, _, _)) => 4 
  case CC_C(_, _, _) => 5 
  case CC_C(_, CC_B(_, _, _), CC_A(_, _, _)) => 6 
  case CC_C(_, CC_C(_, _, _), _) => 7 
  case CC_D(CC_C(_, _, _), CC_B(_, _, _), CC_A(_, _, _)) => 8 
  case CC_D(CC_B(_, _, _), CC_D(_, _, _), CC_A(_, _, _)) => 9 
  case CC_D(CC_B(_, _, _), _, CC_A(_, _, _)) => 10 
  case CC_D(CC_D(_, _, _), CC_D(_, _, _), CC_A(_, _, _)) => 11 
  case CC_D(_, _, CC_A(_, _, _)) => 12 
  case CC_D(CC_B(_, _, _), CC_C(_, _, _), _) => 13 
  case CC_D(CC_D(_, _, _), CC_D(_, _, _), _) => 14 
  case CC_D(CC_D(_, _, _), CC_C(_, _, _), CC_A(_, _, _)) => 15 
  case CC_D(CC_D(_, _, _), _, _) => 16 
  case CC_D(CC_C(_, _, _), CC_D(_, _, _), _) => 17 
  case CC_D(CC_D(_, _, _), CC_B(_, _, _), _) => 18 
  case CC_D(_, CC_C(_, _, _), CC_A(_, _, _)) => 19 
  case CC_D(_, _, _) => 20 
  case CC_D(CC_C(_, _, _), CC_C(_, _, _), CC_A(_, _, _)) => 21 
  case CC_D(CC_D(_, _, _), CC_C(_, _, _), _) => 22 
  case CC_D(CC_C(_, _, _), CC_B(_, _, _), _) => 23 
  case CC_D(_, CC_D(_, _, _), CC_A(_, _, _)) => 24 
  case CC_D(_, CC_B(_, _, _), _) => 25 
  case CC_D(CC_B(_, _, _), CC_D(_, _, _), _) => 26 
  case CC_D(CC_C(_, _, _), CC_D(_, _, _), CC_A(_, _, _)) => 27 
  case CC_D(CC_B(_, _, _), CC_C(_, _, _), CC_A(_, _, _)) => 28 
  case CC_D(CC_B(_, _, _), CC_B(_, _, _), _) => 29 
  case CC_D(CC_B(_, _, _), CC_B(_, _, _), CC_A(_, _, _)) => 30 
  case CC_D(CC_C(_, _, _), CC_C(_, _, _), _) => 31 
  case CC_D(CC_C(_, _, _), _, _) => 32 
  case CC_D(_, CC_C(_, _, _), _) => 33 
  case CC_D(CC_C(_, _, _), _, CC_A(_, _, _)) => 34 
  case CC_D(_, CC_B(_, _, _), CC_A(_, _, _)) => 35 
  case CC_D(CC_D(_, _, _), CC_B(_, _, _), CC_A(_, _, _)) => 36 
  case CC_D(_, CC_D(_, _, _), _) => 37 
  case CC_D(CC_D(_, _, _), _, CC_A(_, _, _)) => 38 
}
}
// This is not matched: (CC_C Char T_A Wildcard Wildcard Wildcard (T_B Char))
// This is not matched: (CC_C T_A)