package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, ((Boolean,Byte),T_A[Char, Int])]
case class CC_B[E](a: T_A[E, E]) extends T_A[E, ((Boolean,Byte),T_A[Char, Int])]
case class CC_C[F]() extends T_B[F]
case class CC_D[G](a: G, b: G, c: (T_B[Int],(Boolean,Boolean))) extends T_B[G]

val v_a: T_A[Char, ((Boolean,Byte),T_A[Char, Int])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}