package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: (Byte,Byte)) extends T_A
case class CC_B(a: T_B[Int]) extends T_A
case class CC_C[B](a: CC_B) extends T_A
case class CC_D() extends T_B[T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(_) => 1 
  case CC_C(CC_B(_)) => 2 
}
}