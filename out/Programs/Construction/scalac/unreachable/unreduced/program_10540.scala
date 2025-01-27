package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_B[E]) extends T_A[D, E]
case class CC_B[F, G]() extends T_A[G, F]
case class CC_C(a: T_A[CC_A[Byte, Int], (Char,Byte)], b: T_A[Char, (Boolean,Char)], c: (T_A[Char, Byte],T_A[Boolean, (Char,Boolean)])) extends T_B[Int]

val v_a: T_A[Char, CC_C] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}