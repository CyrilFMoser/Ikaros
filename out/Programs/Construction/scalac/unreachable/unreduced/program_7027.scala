package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[Boolean, T_A[T_A[Char, (Char,Boolean)], (Byte,Boolean)]]
case class CC_B[D](a: CC_A[CC_A[D]], b: Boolean, c: T_A[D, D]) extends T_A[Boolean, T_A[T_A[Char, (Char,Boolean)], (Byte,Boolean)]]
case class CC_C(a: (CC_B[Byte],CC_A[Byte]), b: CC_B[(Byte,Int)], c: CC_B[CC_A[Boolean]]) extends T_A[Boolean, T_A[T_A[Char, (Char,Boolean)], (Byte,Boolean)]]

val v_a: T_A[Boolean, T_A[T_A[Char, (Char,Boolean)], (Byte,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, _, CC_B(_, _, _)) => 2 
}
}