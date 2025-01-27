package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D]) extends T_A[D]
case class CC_B(a: T_A[T_B[Boolean, Byte]]) extends T_B[T_A[CC_A[Int]], T_B[Byte, T_A[Char]]]
case class CC_C(a: T_B[Byte, Boolean]) extends T_B[T_A[CC_A[Int]], T_B[Byte, T_A[Char]]]
case class CC_D(a: Boolean, b: CC_B, c: (T_B[CC_B, CC_C],Int)) extends T_B[T_A[CC_A[Int]], T_B[Byte, T_A[Char]]]

val v_a: T_B[T_A[CC_A[Int]], T_B[Byte, T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(CC_A(_))) => 0 
  case CC_C(_) => 1 
  case CC_D(_, CC_B(CC_A(_)), (_,_)) => 2 
}
}