package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, Char]
case class CC_B(a: T_A[T_B, T_B], b: (T_B,Byte)) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, (_,0)) => 0 
}
}
// This is not matched: Pattern match is empty without constants