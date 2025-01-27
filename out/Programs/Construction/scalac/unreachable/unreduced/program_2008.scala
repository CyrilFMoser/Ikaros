package Program_19 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[T_A, Char], c: T_B[Boolean, T_B[T_A, T_A]]) extends T_A
case class CC_B[C](a: Boolean, b: C, c: T_B[T_B[CC_A, C], C]) extends T_B[T_B[CC_A, C], C]
case class CC_C[D](a: (Byte,T_B[CC_A, (Boolean,Byte)]), b: D, c: T_B[T_B[CC_A, D], D]) extends T_B[T_B[CC_A, D], D]
case class CC_D[E]() extends T_B[T_B[CC_A, E], E]

val v_a: T_B[T_B[CC_A, Int], Int] = null
val v_b: Int = v_a match{
  case CC_B(true, _, CC_B(_, _, CC_B(_, _, _))) => 0 
  case CC_B(true, _, CC_B(_, _, CC_C(_, _, _))) => 1 
  case CC_B(true, _, CC_B(_, _, CC_D())) => 2 
  case CC_B(true, _, CC_C((_,_), _, _)) => 3 
  case CC_B(true, _, CC_D()) => 4 
  case CC_B(false, _, CC_B(_, _, CC_B(_, _, _))) => 5 
  case CC_B(false, _, CC_B(_, _, CC_C(_, _, _))) => 6 
  case CC_B(false, _, CC_B(_, _, CC_D())) => 7 
  case CC_B(false, _, CC_C((_,_), _, _)) => 8 
  case CC_B(false, _, CC_D()) => 9 
  case CC_C(_, _, _) => 10 
  case CC_D() => 11 
}
}