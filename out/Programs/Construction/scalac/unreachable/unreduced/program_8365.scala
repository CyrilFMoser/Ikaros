package Program_26 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_A, b: T_B[Int, CC_A], c: CC_A) extends T_A
case class CC_C[C]() extends T_B[C, Byte]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}