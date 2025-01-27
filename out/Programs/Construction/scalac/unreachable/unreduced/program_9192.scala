package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_B[E, F], b: T_B[F, F], c: (T_A[Boolean, (Char,Byte)],T_A[(Byte,Byte), (Boolean,Byte)])) extends T_A[F, E]
case class CC_B[G](a: G, b: Char, c: G) extends T_A[G, T_B[G, G]]
case class CC_C[H](a: T_B[H, H], b: CC_A[H, H], c: Boolean) extends T_B[CC_A[H, CC_A[H, H]], H]
case class CC_D(a: CC_C[Int], b: T_A[T_A[Boolean, Boolean], T_B[T_A[Boolean, Boolean], T_A[Boolean, Boolean]]], c: CC_C[T_A[Boolean, Boolean]]) extends T_B[CC_A[T_A[T_B[Char, Char], T_B[T_B[Char, Char], T_B[Char, Char]]], CC_A[T_A[T_B[Char, Char], T_B[T_B[Char, Char], T_B[Char, Char]]], T_A[T_B[Char, Char], T_B[T_B[Char, Char], T_B[Char, Char]]]]], T_A[T_B[Char, Char], T_B[T_B[Char, Char], T_B[Char, Char]]]]
case class CC_E(a: CC_B[Char], b: (CC_B[CC_D],(CC_D,(Boolean,Byte)))) extends T_B[CC_A[T_A[T_B[Char, Char], T_B[T_B[Char, Char], T_B[Char, Char]]], CC_A[T_A[T_B[Char, Char], T_B[T_B[Char, Char], T_B[Char, Char]]], T_A[T_B[Char, Char], T_B[T_B[Char, Char], T_B[Char, Char]]]]], T_A[T_B[Char, Char], T_B[T_B[Char, Char], T_B[Char, Char]]]]

val v_a: T_B[CC_A[T_A[T_B[Char, Char], T_B[T_B[Char, Char], T_B[Char, Char]]], CC_A[T_A[T_B[Char, Char], T_B[T_B[Char, Char], T_B[Char, Char]]], T_A[T_B[Char, Char], T_B[T_B[Char, Char], T_B[Char, Char]]]]], T_A[T_B[Char, Char], T_B[T_B[Char, Char], T_B[Char, Char]]]] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_E(_, (CC_B(_, _, _),(_,_))) => 1 
}
}
// This is not matched: CC_D(_, _, _)