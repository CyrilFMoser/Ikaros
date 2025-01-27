package Program_18 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: (T_A,T_A), b: (T_B[Int],Char), c: T_A) extends T_A
case class CC_B[B]() extends T_B[B]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
}
}