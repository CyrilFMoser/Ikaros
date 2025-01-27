package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, (T_A,(Boolean,Char))]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: (CC_B,(Boolean,Int)), b: CC_B) extends T_A
case class CC_D[C](a: T_B[C, C]) extends T_B[C, Byte]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C(_, CC_B()) => 2 
}
}