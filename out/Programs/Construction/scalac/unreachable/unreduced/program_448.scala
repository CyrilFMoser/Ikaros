package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[T_A[T_B, (T_B,T_B)], (T_B,T_A[Byte, Char])]
case class CC_B(a: T_A[CC_A, ((Boolean,Char),CC_A)], b: T_B, c: T_B) extends T_A[T_A[T_B, (T_B,T_B)], (T_B,T_A[Byte, Char])]
case class CC_C(a: (Int,(Boolean,T_B))) extends T_A[T_A[T_B, (T_B,T_B)], (T_B,T_A[Byte, Char])]
case class CC_D(a: CC_B) extends T_B
case class CC_E(a: CC_C, b: CC_C, c: CC_D) extends T_B
case class CC_F(a: Boolean) extends T_B

val v_a: T_A[T_A[T_B, (T_B,T_B)], (T_B,T_A[Byte, Char])] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_)) => 0 
  case CC_A(CC_E(_, _, _)) => 1 
  case CC_A(CC_F(_)) => 2 
  case CC_B(_, _, _) => 3 
  case CC_C(_) => 4 
}
}