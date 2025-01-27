package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: (T_A[Boolean],T_B[Byte]), b: Int) extends T_A[T_B[T_A[(Boolean,Byte)]]]
case class CC_B(a: T_A[T_A[Byte]], b: Char) extends T_A[T_B[T_A[(Boolean,Byte)]]]
case class CC_C(a: CC_A[T_A[CC_B]], b: T_B[CC_B], c: CC_B) extends T_A[T_B[T_A[(Boolean,Byte)]]]
case class CC_D[D](a: (CC_A[(Boolean,Char)],T_B[Int]), b: D, c: Char) extends T_B[D]

val v_a: T_A[T_B[T_A[(Boolean,Byte)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, 12) => 0 
  case CC_A(_, _) => 1 
  case CC_B(_, 'x') => 2 
  case CC_B(_, _) => 3 
  case CC_C(CC_A((_,_), _), CC_D((_,_), CC_B(_, _), _), CC_B(_, _)) => 4 
}
}