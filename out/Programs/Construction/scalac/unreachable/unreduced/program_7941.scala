package Program_2 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]]) extends T_A[(Int,T_A[Boolean])]
case class CC_B(a: Boolean, b: ((CC_A,CC_A),Byte)) extends T_A[(Int,T_A[Boolean])]
case class CC_C(a: CC_B) extends T_A[Boolean]

val v_a: T_A[(Int,T_A[Boolean])] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}