package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[Int]
case class CC_B() extends T_B
case class CC_C(a: T_A[T_A[Int]], b: T_B) extends T_B
case class CC_D() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, CC_B()) => 1 
  case CC_C(_, CC_C(_, _)) => 2 
  case CC_C(_, CC_D()) => 3 
  case CC_D() => 4 
}
}