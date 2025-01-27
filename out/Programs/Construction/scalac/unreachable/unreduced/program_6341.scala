package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B) extends T_A[C, T_B]
case class CC_B[D](a: (T_B,Byte), b: (T_A[T_B, (Char,Boolean)],T_A[T_B, T_B])) extends T_A[Char, T_B]
case class CC_C() extends T_A[Char, T_B]
case class CC_D(a: CC_A[Boolean]) extends T_B

val v_a: T_A[Char, T_B] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B((CC_D(_),0), (_,CC_A(_))) => 1 
  case CC_C() => 2 
}
}
// This is not matched: CC_B((CC_D(_),_), (_,CC_A(_)))