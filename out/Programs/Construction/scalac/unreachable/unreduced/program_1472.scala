package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Char) extends T_A[T_A[T_B[Boolean]]]
case class CC_B(a: (CC_A,CC_A), b: ((CC_A,CC_A),T_B[CC_A])) extends T_B[T_B[(CC_A,(Boolean,Int))]]
case class CC_C[C](a: Byte) extends T_B[C]
case class CC_D[D](a: (T_A[Byte],T_B[CC_B])) extends T_B[T_B[(CC_A,(Boolean,Int))]]

val v_a: T_B[T_B[(CC_A,(Boolean,Int))]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_D((_,_)) => 1 
}
}
// This is not matched: CC_C(_)