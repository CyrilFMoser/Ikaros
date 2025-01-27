package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: Int, b: (T_A[Char, (Boolean,Byte)],(Int,Int)), c: T_B[T_A[Boolean, (Boolean,Char)]]) extends T_A[T_B[T_A[Byte, Char]], T_A[Int, T_B[Byte]]]
case class CC_B(a: T_B[T_A[CC_A, CC_A]]) extends T_A[T_B[T_A[Byte, Char]], T_A[Int, T_B[Byte]]]
case class CC_C() extends T_A[T_B[T_A[Byte, Char]], T_A[Int, T_B[Byte]]]
case class CC_D(a: CC_A, b: (T_B[(Int,Boolean)],CC_C)) extends T_B[T_A[CC_B, (CC_C,(Int,Boolean))]]
case class CC_E[D](a: T_A[D, D], b: D, c: D) extends T_B[D]

val v_a: T_A[T_B[T_A[Byte, Char]], T_A[Int, T_B[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(12, (_,(_,_)), _) => 0 
  case CC_A(_, (_,(_,_)), _) => 1 
  case CC_B(CC_E(_, _, _)) => 2 
  case CC_C() => 3 
}
}