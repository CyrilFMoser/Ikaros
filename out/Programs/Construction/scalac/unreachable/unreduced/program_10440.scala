package Program_27 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Int]) extends T_A[Byte]
case class CC_B(a: (T_A[Boolean],Char)) extends T_A[Byte]
case class CC_C(a: (T_A[Byte],Int), b: CC_A) extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
  case CC_C(_, _) => 2 
}
}