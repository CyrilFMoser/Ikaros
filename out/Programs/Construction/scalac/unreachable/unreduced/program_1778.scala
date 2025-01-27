package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: Boolean, c: C) extends T_A[T_A[T_A[T_B, T_B], T_B], C]
case class CC_B(a: T_A[T_B, T_A[T_B, T_B]], b: (Boolean,T_A[T_B, T_B]), c: T_B) extends T_B
case class CC_C(a: Char, b: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, (_,_), CC_C(_, _)) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_B(_, (_,_), CC_B(_, _, _))