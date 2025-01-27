package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Char) extends T_A[C, (T_B,T_A[(Char,Byte), Byte])]
case class CC_B(a: T_A[CC_A[T_B], CC_A[Int]], b: T_B, c: (CC_A[T_B],T_A[T_B, T_B])) extends T_B
case class CC_C(a: T_B, b: CC_A[(CC_B,T_B)], c: (Boolean,CC_A[Char])) extends T_B
case class CC_D(a: CC_B, b: Char) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_, _, _) => 1 
  case CC_D(CC_B(_, _, _), 'x') => 2 
}
}
// This is not matched: CC_D(CC_B(_, _, _), _)