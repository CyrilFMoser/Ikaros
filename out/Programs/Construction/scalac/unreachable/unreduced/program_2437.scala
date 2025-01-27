package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_B[E], b: Boolean, c: T_A[D, E]) extends T_A[E, D]
case class CC_B(a: T_A[T_B[(Boolean,Byte)], (Byte,Int)]) extends T_A[T_A[T_A[Char, Byte], T_A[Int, Char]], T_A[T_B[(Boolean,Int)], Boolean]]
case class CC_C(a: (T_A[CC_B, CC_B],Char)) extends T_A[T_A[T_A[Char, Byte], T_A[Int, Char]], T_A[T_B[(Boolean,Int)], Boolean]]
case class CC_D() extends T_B[(T_A[CC_C, Byte],Int)]

val v_a: T_A[T_A[T_A[Char, Byte], T_A[Int, Char]], T_A[T_B[(Boolean,Int)], Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, CC_A(_, _, _))) => 0 
  case CC_A(_, _, CC_A(_, _, CC_B(_))) => 1 
  case CC_A(_, _, CC_A(_, _, CC_C(_))) => 2 
  case CC_B(CC_A(_, _, CC_A(_, _, _))) => 3 
  case CC_C(_) => 4 
}
}