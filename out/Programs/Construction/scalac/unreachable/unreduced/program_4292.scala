package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: (T_B,Byte), b: T_A[Boolean], c: T_B) extends T_A[T_A[T_A[T_B]]]
case class CC_B(a: T_A[T_A[(Boolean,Boolean)]], b: T_B, c: CC_A) extends T_B
case class CC_C(a: CC_B, b: CC_A) extends T_B
case class CC_D() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_, CC_A((_,_), _, _)) => 1 
  case CC_D() => 2 
}
}