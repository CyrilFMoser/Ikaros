package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_B[Boolean, Char]], b: T_B[T_A[Byte], T_B[Int, (Boolean,Byte)]]) extends T_A[T_B[T_A[Boolean], T_A[Int]]]
case class CC_B(a: T_B[CC_A, T_B[CC_A, Char]]) extends T_A[T_B[T_A[Boolean], T_A[Int]]]
case class CC_C(a: (CC_A,Byte), b: CC_B, c: Int) extends T_A[T_B[T_A[Boolean], T_A[Int]]]

val v_a: T_A[T_B[T_A[Boolean], T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_C(_, CC_B(_), _)