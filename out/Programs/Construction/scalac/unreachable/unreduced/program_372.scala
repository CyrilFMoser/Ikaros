package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: Boolean) extends T_A[T_A[T_A[Char, T_B], T_A[T_B, Int]], T_A[T_A[T_B, T_B], T_B]]
case class CC_B() extends T_A[T_A[T_A[Char, T_B], T_A[T_B, Int]], T_A[T_A[T_B, T_B], T_B]]
case class CC_C(a: T_A[CC_B, Byte], b: CC_B, c: ((CC_B,(Int,Boolean)),T_A[(Boolean,Char), CC_A])) extends T_B
case class CC_D() extends T_B
case class CC_E(a: CC_B, b: CC_B, c: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, _, (_,_)) => 0 
  case CC_D() => 1 
  case CC_E(_, CC_B(), _) => 2 
}
}