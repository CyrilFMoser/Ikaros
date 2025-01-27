package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_B[T_A]], b: T_A, c: Char) extends T_A
case class CC_B() extends T_A
case class CC_C(a: (CC_B,T_B[Int])) extends T_B[T_B[T_A]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_C((_,_)), _, _) => 0 
  case CC_B() => 1 
}
}