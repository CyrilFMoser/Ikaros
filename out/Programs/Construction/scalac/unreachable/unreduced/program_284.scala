package Program_25 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: Boolean) extends T_A
case class CC_B(a: CC_A, b: T_B[Int]) extends T_A
case class CC_C() extends T_A
case class CC_D(a: (Char,Int)) extends T_B[Int]
case class CC_E(a: T_B[((Byte,Byte),CC_D)]) extends T_B[Int]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_D((_,_)) => 0 
  case CC_E(_) => 1 
}
}