package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[((T_B,Byte),T_B), C]
case class CC_B(a: CC_A[CC_A[T_B]], b: T_A[T_B, T_A[Char, T_B]], c: Char) extends T_A[((T_B,Byte),T_B), T_B]
case class CC_C(a: CC_A[T_B], b: T_B) extends T_B
case class CC_D(a: CC_A[CC_A[CC_C]], b: CC_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_A(), CC_C(CC_A(), CC_C(_, _))) => 0 
  case CC_C(CC_A(), CC_C(CC_A(), CC_D(_, _))) => 1 
  case CC_C(CC_A(), CC_D(CC_A(), CC_B(_, _, _))) => 2 
  case CC_D(_, CC_B(CC_A(), _, _)) => 3 
}
}