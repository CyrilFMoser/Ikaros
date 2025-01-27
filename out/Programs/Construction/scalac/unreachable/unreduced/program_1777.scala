package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Int, T_A[Boolean, Int]]) extends T_A[Byte, (Int,T_A[Int, Int])]
case class CC_B() extends T_A[Byte, (Int,T_A[Int, Int])]
case class CC_C(a: T_A[CC_A, CC_B]) extends T_A[Byte, (Int,T_A[Int, Int])]

val v_a: T_A[Byte, (Int,T_A[Int, Int])] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}