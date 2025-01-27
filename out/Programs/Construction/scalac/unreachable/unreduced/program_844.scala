package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C], b: T_A[C], c: T_A[C]) extends T_A[C]
case class CC_B(a: T_A[T_A[(Char,Byte)]], b: T_A[Char]) extends T_A[T_A[CC_A[Byte]]]
case class CC_C[D](a: T_A[D]) extends T_A[D]
case class CC_D(a: T_A[T_B[CC_B]], b: T_A[T_A[CC_B]], c: (CC_A[(Boolean,Char)],CC_C[CC_B])) extends T_B[T_B[Boolean]]
case class CC_E(a: (T_A[CC_D],T_A[CC_D])) extends T_B[T_B[Boolean]]

val v_a: T_A[T_A[CC_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _), CC_A(_, _, _)) => 1 
  case CC_B(CC_C(_), CC_A(_, _, _)) => 2 
  case CC_B(CC_C(_), CC_C(_)) => 3 
  case CC_C(_) => 4 
}
}
// This is not matched: CC_B(CC_A(_, _, _), CC_C(_))