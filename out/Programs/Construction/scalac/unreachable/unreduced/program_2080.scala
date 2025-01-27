package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: (T_A[Int],T_B[Boolean])) extends T_A[C]
case class CC_B() extends T_A[T_A[T_A[Byte]]]
case class CC_C(a: Boolean) extends T_A[T_A[T_A[Byte]]]
case class CC_D(a: T_B[CC_A[Int]], b: Byte) extends T_B[Char]
case class CC_E(a: CC_D, b: (Boolean,T_A[CC_D])) extends T_B[Char]
case class CC_F(a: CC_B, b: (T_B[Char],Boolean), c: T_A[CC_D]) extends T_B[Char]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
  case CC_E(_, (true,CC_A(_))) => 1 
  case CC_E(_, (false,CC_A(_))) => 2 
  case CC_F(_, _, _) => 3 
}
}