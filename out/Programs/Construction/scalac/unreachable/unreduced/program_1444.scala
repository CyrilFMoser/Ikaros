package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_B, c: T_A[C, Int]) extends T_A[C, Int]
case class CC_B() extends T_B
case class CC_C(a: CC_B, b: T_A[Char, Int], c: (T_A[Int, CC_B],T_A[(Byte,Byte), CC_B])) extends T_B
case class CC_D() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_B(), _, (_,_)) => 1 
}
}
// This is not matched: CC_D()