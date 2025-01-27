package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_A, c: T_A) extends T_A
case class CC_B(a: T_A, b: T_B[T_B[CC_A, T_A], Byte], c: (T_A,T_A)) extends T_A
case class CC_C(a: T_A, b: CC_A) extends T_A
case class CC_D[C](a: C) extends T_B[C, CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
  case CC_A(_, _, CC_B(_, _, _)) => 1 
  case CC_A(_, _, CC_C(_, _)) => 2 
  case CC_B(_, _, _) => 3 
}
}
// This is not matched: CC_C(_, CC_A(_, _, _))