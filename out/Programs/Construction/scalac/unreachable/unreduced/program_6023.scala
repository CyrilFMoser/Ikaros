package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Boolean) extends T_A[T_A[T_A[Char, Char], T_A[Char, Char]], T_A[(Byte,Int), (Char,Char)]]
case class CC_B(a: Boolean, b: (T_A[CC_A, CC_A],T_A[CC_A, CC_A])) extends T_A[T_A[T_A[Char, Char], T_A[Char, Char]], T_A[(Byte,Int), (Char,Char)]]
case class CC_C[C](a: CC_B, b: C, c: C) extends T_A[T_A[T_A[Char, Char], T_A[Char, Char]], T_A[(Byte,Int), (Char,Char)]]

val v_a: T_A[T_A[T_A[Char, Char], T_A[Char, Char]], T_A[(Byte,Int), (Char,Char)]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, (_,_)) => 1 
  case CC_C(CC_B(_, _), _, _) => 2 
}
}