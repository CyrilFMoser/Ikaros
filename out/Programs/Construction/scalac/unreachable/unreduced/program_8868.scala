package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: T_A[D, D]) extends T_A[(T_A[Boolean, Int],T_A[Byte, Boolean]), D]
case class CC_B[F, E](a: E) extends T_A[F, E]
case class CC_C(a: CC_B[(Boolean,Int), CC_B[Byte, (Boolean,Int)]], b: (T_A[Byte, Byte],CC_A[Char]), c: CC_B[T_A[Int, Byte], Int]) extends T_B[Boolean]
case class CC_D(a: T_B[Boolean], b: T_A[CC_A[CC_C], (CC_C,CC_C)]) extends T_B[Boolean]
case class CC_E(a: T_A[Byte, (CC_D,CC_C)], b: T_B[Boolean]) extends T_B[Boolean]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(CC_B(_)), (CC_B(_),CC_A(_, _)), CC_B(_)) => 0 
  case CC_D(_, _) => 1 
  case CC_E(CC_B((_,_)), _) => 2 
}
}