package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B], b: (T_B,T_A[Byte])) extends T_A[(Byte,T_A[T_B])]
case class CC_B(a: T_A[T_A[(Boolean,Boolean)]], b: Boolean) extends T_A[(Byte,T_A[T_B])]
case class CC_C(a: Byte, b: (Boolean,Byte), c: CC_A) extends T_B
case class CC_D() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, (_,_), CC_A(_, _)) => 0 
  case CC_D() => 1 
}
}