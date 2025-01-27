package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B[C]() extends T_B[C, Byte]
case class CC_C[D](a: T_B[D, Byte], b: T_B[D, D], c: D) extends T_B[D, Byte]
case class CC_D[E](a: E, b: CC_B[E], c: Int) extends T_B[E, Byte]

val v_a: T_B[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_B(), _, _) => 1 
  case CC_C(CC_C(_, _, _), _, _) => 2 
  case CC_C(CC_D(_, _, _), _, _) => 3 
  case CC_D(_, CC_B(), _) => 4 
}
}