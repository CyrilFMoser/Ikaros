package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[((Boolean,T_B),Char)]
case class CC_B(a: T_B, b: Char, c: Char) extends T_A[((Boolean,T_B),Char)]
case class CC_C(a: Int) extends T_A[((Boolean,T_B),Char)]
case class CC_D(a: T_A[(T_B,Int)], b: T_A[T_B]) extends T_B
case class CC_E(a: T_B, b: Boolean) extends T_B
case class CC_F(a: T_A[T_A[Int]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
  case CC_E(_, true) => 1 
  case CC_E(_, false) => 2 
  case CC_F(_) => 3 
}
}