package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B](a: (T_B[T_A],T_A), b: T_A, c: (T_A,(T_A,T_A))) extends T_A
case class CC_B(a: (T_B[Boolean],T_A), b: T_A, c: T_A) extends T_B[T_A]
case class CC_C(a: T_B[T_B[CC_B]], b: CC_B, c: T_A) extends T_B[T_A]
case class CC_D(a: CC_A[(CC_B,Char)]) extends T_B[T_A]

val v_a: T_B[T_A] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_B((_,_), _, _), CC_A(_, _, _)) => 0 
  case CC_D(_) => 1 
}
}
// This is not matched: CC_B((_,CC_A(_, _, _)), _, _)