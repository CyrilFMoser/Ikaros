package Program_62 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[(Int,Byte)]) extends T_A[T_A[Boolean]]
case class CC_B[C]() extends T_B[C]
case class CC_C[D](a: T_A[D], b: (CC_A,(Boolean,Byte))) extends T_B[D]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_C(_, (CC_A(CC_C(_, _)),_)) => 0 
  case CC_B() => 1 
}
}
// This is not matched: (CC_B Char Wildcard (T_B Char))