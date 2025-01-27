package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]], b: (T_A[Boolean],T_A[Boolean])) extends T_A[T_A[((Byte,Byte),Char)]]
case class CC_B[B](a: Byte, b: CC_A) extends T_A[T_A[((Byte,Byte),Char)]]
case class CC_C() extends T_A[T_A[((Byte,Byte),Char)]]

val v_a: T_A[T_A[((Byte,Byte),Char)]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_)) => 0 
  case CC_B(_, CC_A(_, _)) => 1 
  case CC_C() => 2 
}
}