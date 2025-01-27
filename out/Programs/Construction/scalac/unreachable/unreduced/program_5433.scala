package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Byte, Char],T_A[Boolean, Byte]), b: Boolean, c: Char) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_A[D, T_A[D, D]]) extends T_A[D, T_A[D, D]]
case class CC_C(a: T_A[T_A[Char, Byte], T_A[T_A[Char, Byte], T_A[Char, Byte]]]) extends T_A[T_A[T_A[Int, (Boolean,Char)], T_A[T_A[Int, (Boolean,Char)], T_A[Int, (Boolean,Char)]]], T_A[T_A[T_A[Int, (Boolean,Char)], T_A[T_A[Int, (Boolean,Char)], T_A[Int, (Boolean,Char)]]], T_A[T_A[Int, (Boolean,Char)], T_A[T_A[Int, (Boolean,Char)], T_A[Int, (Boolean,Char)]]]]]

val v_a: T_A[T_A[T_A[Int, (Boolean,Char)], T_A[T_A[Int, (Boolean,Char)], T_A[Int, (Boolean,Char)]]], T_A[T_A[T_A[Int, (Boolean,Char)], T_A[T_A[Int, (Boolean,Char)], T_A[Int, (Boolean,Char)]]], T_A[T_A[Int, (Boolean,Char)], T_A[T_A[Int, (Boolean,Char)], T_A[Int, (Boolean,Char)]]]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), true, 'x') => 0 
  case CC_A((_,_), false, 'x') => 1 
  case CC_A((_,_), true, _) => 2 
  case CC_A((_,_), false, _) => 3 
  case CC_B(CC_A((_,_), _, _)) => 4 
  case CC_B(CC_B(CC_A(_, _, _))) => 5 
  case CC_B(CC_B(CC_B(_))) => 6 
  case CC_B(CC_B(CC_C(_))) => 7 
  case CC_B(CC_C(CC_A(_, _, _))) => 8 
  case CC_B(CC_C(CC_B(_))) => 9 
  case CC_C(CC_A((_,_), _, _)) => 10 
  case CC_C(CC_B(CC_A(_, _, _))) => 11 
  case CC_C(CC_B(CC_B(_))) => 12 
}
}