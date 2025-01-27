package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[Char], b: Char) extends T_A[T_A[T_B[Byte]]]
case class CC_B[C]() extends T_A[C]
case class CC_C(a: CC_A, b: (T_A[CC_A],T_B[CC_A])) extends T_A[T_A[T_B[Byte]]]
case class CC_D(a: T_A[CC_B[(Boolean,Int)]], b: T_A[CC_C], c: T_B[CC_B[Char]]) extends T_B[Int]
case class CC_E(a: CC_D) extends T_B[Int]
case class CC_F(a: T_A[CC_A]) extends T_B[Int]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_B(), _) => 0 
  case CC_E(_) => 1 
  case CC_F(CC_B()) => 2 
}
}