package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_A[T_B[Int], T_B[Char]], b: T_B[T_A[Char, Int]]) extends T_A[T_A[T_B[Int], T_B[Byte]], Byte]
case class CC_B(a: T_A[CC_A, T_B[CC_A]], b: T_B[(CC_A,Char)], c: (T_B[Int],Byte)) extends T_A[T_A[T_B[Int], T_B[Byte]], Byte]
case class CC_C(a: T_B[Boolean], b: (CC_A,Int), c: T_B[CC_B]) extends T_B[CC_B]
case class CC_D(a: Char, b: T_B[Int], c: CC_A) extends T_B[CC_B]
case class CC_E(a: CC_B, b: CC_D) extends T_B[CC_B]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_E(_, _) => 1 
}
}
// This is not matched: CC_C(_, _, _)