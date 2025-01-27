package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: Byte, b: T_A[E, E], c: (T_B[(Char,Char)],T_A[Byte, Byte])) extends T_A[D, E]
case class CC_B[G, F](a: Boolean) extends T_A[F, G]
case class CC_C(a: CC_B[T_A[Byte, Char], Byte], b: T_A[Boolean, (Byte,Boolean)]) extends T_B[CC_B[CC_B[Byte, Char], T_A[(Char,Boolean), Byte]]]
case class CC_D(a: Boolean, b: CC_A[CC_B[CC_C, CC_C], T_B[Byte]]) extends T_B[CC_B[CC_B[Byte, Char], T_A[(Char,Boolean), Byte]]]

val v_a: T_A[Char, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(0, CC_A(_, _, _), (_,_)), (_,CC_A(_, _, _))) => 0 
  case CC_A(_, CC_A(0, CC_B(_), (_,_)), (_,CC_A(_, _, _))) => 1 
  case CC_A(_, CC_A(_, CC_A(_, _, _), (_,_)), (_,CC_A(_, _, _))) => 2 
  case CC_A(_, CC_A(_, CC_B(_), (_,_)), (_,CC_A(_, _, _))) => 3 
  case CC_A(_, CC_B(true), (_,CC_A(_, _, _))) => 4 
  case CC_A(_, CC_B(false), (_,CC_A(_, _, _))) => 5 
  case CC_A(_, CC_A(0, CC_A(_, _, _), (_,_)), (_,CC_B(_))) => 6 
  case CC_A(_, CC_A(0, CC_B(_), (_,_)), (_,CC_B(_))) => 7 
  case CC_A(_, CC_A(_, CC_A(_, _, _), (_,_)), (_,CC_B(_))) => 8 
  case CC_A(_, CC_A(_, CC_B(_), (_,_)), (_,CC_B(_))) => 9 
  case CC_A(_, CC_B(true), (_,CC_B(_))) => 10 
  case CC_A(_, CC_B(false), (_,CC_B(_))) => 11 
  case CC_B(_) => 12 
}
}