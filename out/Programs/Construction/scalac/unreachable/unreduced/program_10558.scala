package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B(a: T_A[Boolean], b: CC_A[(Int,Int)], c: CC_A[CC_A[Boolean]]) extends T_B[T_A[T_A[Byte]]]
case class CC_C(a: T_B[Char], b: (T_B[CC_B],Byte), c: T_A[T_A[(Boolean,Boolean)]]) extends T_B[T_A[T_A[Byte]]]

val v_a: T_B[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(), CC_A(), _) => 0 
  case CC_C(_, (_,_), CC_A()) => 1 
}
}