package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Int) extends T_A[T_A[T_B[(Boolean,Int), Boolean]]]
case class CC_B(a: (Boolean,T_A[Int]), b: T_A[T_A[Char]]) extends T_A[T_A[T_B[(Boolean,Int), Boolean]]]

val v_a: T_A[T_A[T_B[(Boolean,Int), Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B((_,_), _) => 1 
}
}