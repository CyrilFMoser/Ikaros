package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[Int], b: T_A, c: T_B[Boolean]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: ((CC_A,Byte),Byte), b: CC_B, c: T_A) extends T_B[Int]
case class CC_D(a: CC_B, b: CC_B, c: T_B[Int]) extends T_B[Int]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_, _, _), _, _) => 0 
  case CC_A(CC_D(_, _, _), _, _) => 1 
  case CC_B() => 2 
}
}