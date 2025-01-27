package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: (T_A[Char],(Boolean,Int)), b: T_B[Int, (Int,Boolean)]) extends T_A[T_B[T_B[Byte, Int], T_A[Boolean]]]
case class CC_B() extends T_A[T_B[T_B[Byte, Int], T_A[Boolean]]]
case class CC_C[D]() extends T_B[D, CC_A]

val v_a: T_A[T_B[T_B[Byte, Int], T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}