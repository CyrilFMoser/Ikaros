package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_B[F]() extends T_A[T_B[Char, (Char,Int)], F]
case class CC_C() extends T_A[T_B[Char, (Char,Int)], CC_B[Char]]
case class CC_D[G](a: (Char,Int)) extends T_B[CC_C, G]

val v_a: CC_D[Char] = null
val v_b: Int = v_a match{
  case CC_D(('x',_)) => 0 
}
}
// This is not matched: (CC_D (CC_A Boolean Boolean Boolean (T_A Boolean))
//      (CC_C (CC_A Boolean Boolean Boolean Boolean)
//            Char
//            (T_B (CC_A Boolean Boolean Boolean Boolean)))
//      (T_B (CC_A Boolean Boolean Boolean (T_A Boolean))))