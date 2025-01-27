package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Boolean) extends T_A[T_A[T_B[Char]]]
case class CC_B(a: CC_A, b: (T_A[Boolean],CC_A), c: T_A[(CC_A,Int)]) extends T_A[T_A[T_B[Char]]]
case class CC_C[C](a: T_B[C], b: (CC_A,CC_B)) extends T_B[C]
case class CC_D[D]() extends T_B[D]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(CC_C(_, _), (_,_)), (CC_A(_),CC_B(_, _, _))) => 0 
  case CC_C(CC_C(CC_D(), (_,_)), (CC_A(_),CC_B(_, _, _))) => 1 
  case CC_C(CC_D(), (CC_A(_),CC_B(_, _, _))) => 2 
  case CC_D() => 3 
}
}